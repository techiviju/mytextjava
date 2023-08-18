		//		Q 1

		for (int i = 4; i >= 1; i--) {
			    for (int j = 1; j <= i; j++) {
				System.out.print("*");
			    }
			    System.out.println();
			}

						// using while loop //

		 int i=5;
		    while(i>=1){
			int j=1;
			while(j<=i){
			    System.out.print("*");
			    j++;
			}
			System.out.println("");
			i--;
		    }


					//  USING do-while loop  ///
			int i=5;
		do{
		    int j=1;
		    do{
			System.out.print("*");
			j++;
		    }while(j<=i);

		    i--;
		    System.out.println("");
		}while(i>=1);


		// practice q 2//
		int sum=0;
		    int i=0;
		    int n=4;
			while(i<n)
			{
			    sum=sum+(2*i);
			   i++;
			   	 System.out.println(sum);
			}
			 System.out.println(sum);

		//   Q 2 using for loop

		int sum=0;
		int n=4
		for(int i=0;i<n;i++)
		{
		sum=sum+(2*i);
		}
		System.out.print("the sum of even nu is");
		System.out.print(sum);
		// the first 4 even nu is 0+2+4+6 = 12 //

		// Q 3
		/// WRITE A PROGRAM TO PRINT MULTIPLICATION TABLE 
			int n=78549;
			for(int i=1;i<=10;i++){
			    System.out.printf("%d X %d = %d",i,n,n*i);
			    System.out.println("");
			}

		//Q 4
		int n=10;
		for(int i=10;i>=1;i--)
		printf("%d X %d = %d\n",n,i,n*i);

				// Q 5
		    // !5=5*4*3*2*1=facto;
		    int n=5;
		    int facto=1;
			for(int i=1;i<=n;i++)
			    {
			   facto =facto*i;
			    }
			    System.out.println(facto);
			   


		//Q 6
		//what is factorial !5=5*4*3*2*1=facto;
		int n=5;
		int i=1;
		int facto =1;
		while(i<=n){
		facto *=i;
		i++;
		}
		println(facto);

		//  Q 7 

		  int i=4;
		    while(i>=1)
		{
		 
		    int j=1;
		    while(j<=i){
		   
		    System.out.print("*");
			 j++;
		    }
		    
		       i--;
		       System.out.println("");
		}	  

		/// Q 8 is true

		// Q 9
		int sum=0;
		int n=10;
		for(int i=10;i>=1;i--)
		{sum +=n*i;
		}
		println(sum);


