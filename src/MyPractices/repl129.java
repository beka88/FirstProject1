package MyPractices;

public class repl129 {
    public static void main(String[] args) {
        String[]arr={"zero","one","two","three","four"};
        String temp="";
        for(int i=0; i<arr.length;i++){
            if(arr[i].contains("e")){
                temp+=arr.length;
            }
        }

        String[]fewValues=temp.split(" ");

    }
}
