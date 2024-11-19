class Student{
    private String name;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;  
    }

}

class GetSet{

    public static void main(String[] args){
        Student cod = new Student();
        cod.setName("Coding");
        System.out.println(cod.getName());
     }

}