class Main
{
    public static void main (String[] args) {
    
    int a[]={2,4,3,5,6};
    int temp;
    for(int i=0;i<a.length;i++)
    {
        for(int j=i+1;j<a.length;j++)
        {
            if(a[i]>a[j])
            {
             temp=a[i];
             a[i]=a[j];
             a[j]=temp;
            }
        }
    }
    for(int ch:a)
    {
        System.out.print(ch+" ");
    }
        
    }
}
