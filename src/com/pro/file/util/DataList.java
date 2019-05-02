package src.com.pro.file.util;

public class DataList<T>{
    private Object[] data=new Object[0];

    public void add(T d){
        int counter=size();
        if(counter==0){
            data=new Object[1];
            data[0]=d;
        }else{
            Object[] newData=new Object[counter+1];
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

    public T[] getAll(){
        return (T[])data;
    }

    public T getData(int index){
        return (T)data[index];
    }
}