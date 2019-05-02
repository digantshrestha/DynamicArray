package src.com.pro.file.util;

public class ArrayHelper{
    private int[] data=new int[0];

    public void add(int d){
        int counter=size();
        if(counter==0){
            data=new int[1];
            data[0]=d;
        }else{
            int[] newData=new int[counter+1];
            for(int i=0;i<counter;i++){
                newData[i]=data[i];
            }
            newData[counter]=d;
            data=newData;
        }
    }

    public int size(){
        return data.length;
    }

    public int[] getAll(){
        return data;
    }

    public int getData(int index){
        return data[index];
    }

    public void bubbleSort(){
        for(int i=0;i<size();i++){
            for(int j=i+1;j<size();j++){
                if(data[i]>data[j]){
                    int temp=data[i];
                    data[i]=data[j];
                    data[j]=temp;
                }
            }
        }
    }

    int counter=-1;
    public boolean next(){
        counter++;
        if(counter==size()){
            counter=size()-1;
            return false;
        }else{
            
            return true;
        }
    }

    public int getValue(){
        return data[counter];
    }

    public void linearSearch(int find){
        boolean result=false;
        for(int i=0;i<size();i++){
            if(find==getData(i)){
                result=true;
                break;
            }else{
                result=false;
            }
        }
        System.out.println(result);
    }

    public boolean binarySearch(int find){
        int low=0;
        int high=size()-1;
        for(int i=low;i<high;i++){
            int mid=(low+high)/2;
            if (find==getData(mid)) {
               return true;
            }else if(find<getData(mid)){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return false;
    }

    
}