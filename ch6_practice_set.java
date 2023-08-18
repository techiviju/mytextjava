////			CH 6 PRACTICE SET

public class Main{
    public static void main(String[]arg){
    // // practice problem 1   
    //  float sum=0.0f;
    //  float []a={20.30f,20.20f,5.1f,6.2f,4.3f};
    // for(int i=0;i<a.length;i++){
    //     sum+=a[i];
    // }
            /// OR   //
    //         for(float element:a){
    //         sum+=element;
    //         }
    //  System.out.println(sum);
   
    
    // Problem no 2
    
            
    }
}


    
       
    // Problem no 2
    
    float []marks={10.2f,15.2f,12.2f,11.23f,6.1f};
    float num=15.21f;
    boolean isArray=false;
    for(float element:marks){
        if(num==element){
            isArray=true;
            break;
        }
            
    }
    if(isArray){
        System.out.println("value is present in the array");
    }
    else 
    System.out.println("value is not present in the array");


	  //Practice no 3//
        
        int []marks={95,65,98,99,63};
        int sum=0;
        for(int element:marks){
            sum+=element;
        }
        System.out.println("the sum avg is ="+sum/marks.length);
        
        
	// practice q 4//
			 
    int [][]marks ={ {5,6,1} ,
                     {9,2,7}};
    
     int [][]marks2 ={ {4,3,9} ,
                       {5,1,6}};
    
     int [][]result ={ {0,0,0} ,
                      {0,0,0}};
    
    for(int i=0;i<marks.length;i++){    //row number of lines
        for(int j=0;j<marks2[i].length;j++){   // column number of time
        System.out.format("Setting value for i=%d and j=%d \n",i,j);
        result[i][j]=marks[i][j]+marks2[i][j];
    
        }
    }
        ///  PRINTING THE ELEMENT OF 2D ARRAY

    
    for(int i=0;i<marks.length;i++){    //row number of lines
        for(int j=0;j<marks2[i].length;j++){   // column number of time
        System.out.print(result[i][j] + "  ");
        result[i][j]=marks[i][j]+marks2[i][j];
    
        }
        System.out.println("");
    }
    
    
	}
}


		/// WRONG .... ONLY ADDI OF NU 
	int [][]arr=new int [2][3];
        arr[0][0]=1;
        arr[0][1]=3;
        arr[0][2]=5;
        arr[1][0]=7;
        arr[1][1]=6;
        arr[1][2]=9;
        int sum=0;
        for(int i=arr.length -1;i>=0;i--){
            for (int j=0;j<3;j++){
                sum+=arr[i][j];
            }
        }
        System.out.println(sum);
        System.out.println(arr.length);
        
	