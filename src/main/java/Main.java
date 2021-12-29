public class Main {
    public static void main(String[] args){
        Client cl=new Client();
        try{
            cl.makeRequest();
        } catch (Exception e){
            e.printStackTrace();
        }
        try{
            cl.makePostRequest();
        } catch (Exception e){
            e.printStackTrace();
        }

    }
}
