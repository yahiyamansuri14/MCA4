import java.util.Scanner;
public class Question21 {
    int c[][]=new int[3][3];

    public void addition(int a[][],int b[][]){
        for(int i=0;i<3;i++)
            for(int j=0;j<3;j++)
                c[i][j]=a[i][j]+b[i][j];
                
    }
    public void substraction(int a[][],int b[][]){
     for(int i=0;i<3;i++)
            for(int j=0;j<3;j++)
                c[i][j]=a[i][j]-b[i][j];
    }
    public void multiplication(int a[][],int b[][]){
    for(int i=0;i<3;i++){    
        for(int j=0;j<3;j++){    
            c[i][j]=0;      
        for(int k=0;k<3;k++)      
        {      
            c[i][j]+=a[i][k]*b[k][j];      
        }
        
        } 
    
    }
    }
    public void printC(){
     for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(c[i][j]+"\t");
            }
            System.out.println("");
     }
    }
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int a[][]=new int[3][3];
        int b[][]=new int[3][3];
        System.out.println("Eneter elements of first matrix");
        for(int i=0;i<3;i++)
            for(int j=0;j<3;j++)
                a[i][j]=scan.nextInt();
        System.out.println("Enter elements of second matrix");
        for(int i=0;i<3;i++)
            for(int j=0;j<3;j++)
                b[i][j]=scan.nextInt();
    System.out.println("Addition is:-");
    Question21 obj=new Question21();
    obj.addition(a,b);
    obj.printC();
    System.out.println("Substraction is:-");
    obj.substraction(a, b);
    obj.printC();
    System.out.println("Multiplication is:-");
    obj.multiplication(a, b);
    obj.printC();
    }
    
}
