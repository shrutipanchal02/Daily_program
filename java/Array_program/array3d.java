public class array3d{
public static void main(String[] args){
int[][][] a={{{10,20,30},{20,30,40}},{{30,70,80},{50,80,100}}};
for(int i=0;i<a.length;i++){
for(int j=0;j<a[i].length;j++){
for(int k=0;k<a[i][j].length;k++){
System.out.print(a[i][j][k] +" ");
}
System.out.println();
}
}
}
}


