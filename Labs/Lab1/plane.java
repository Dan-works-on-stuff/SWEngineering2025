
class plane  implements vehicle{
    @Override
    public void stats(){
        System.out.println("About this plane:");
    }
    @Override
    public void type(){
        System.out.println("-is an air vehicle");
    }
    @Override
    public void fuel(){
        System.out.println("-consumes kerosene");
    }
}
