class simpjava{
    public void sum(){
        int a=30;
        int b=24;
        System.out.println(a+b);
    }
}
class Sum{
    public static void main(String args[]){
        simpjava s=new simpjava();
        System.out.println("The sum of two numbers:");
        System.out.println("sum  updating sum");
        
        s.sum();
    }
}
