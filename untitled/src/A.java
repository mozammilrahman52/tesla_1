public final class A {
    private final int id;
    private A(int id){
        this.id = id;
    }
    public int getId(){
        return id;
    }

    public static void main(String[] args) {
        A a1 = new A(101);
        int b = a1.getId();
        System.out.println(b);
    }

}
