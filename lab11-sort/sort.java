public class sort{
	public static void srt(int array[]){
		int n=array.length;
		int p;
		for (int m=n;m>0;m--){
			for(int i=0;i<n-1;i++){
				p=i+1;
				if(array[i]>array[p]){
					swapNumbers(i,p,array);
				}
			}
		}
	}
	private static void swapNumbers(int i,int j,int[] array){
		int temp;
		temp=array[i];
		array[i]=array[j];
		array[i]=temp;
	}
	public static void main(String[] args){
		int[] ary=new int[20];
		int[] ary2=new int[10];
		int[] ary3=new int[30];
		for(int a=0;a<20;a++){
			ary[a]=(int)(Math.random()*100);
		}
		srt(ary);
		for(int a=0;a<10;a++){
			ary2[a]=(int)(Math.random()*100);
		}
		srt(ary2);
		for(int a=0;a<30;a++){
			if(a<20){
				ary3[a]=ary[a];
			}
			else
			ary3[a]=ary2[a-20];
		}
		srt(ary3);
		for(int a=0;a<30;a++){
			System.out.println(ary3[a]);
		}
	}
}