import java.util.Stack;

class Tes1{
    Stack<Integer> stack = new Stack<Integer>();
    
    public void TambahNilai(Integer i){
    stack.push(i);
    }
    
    public void HapusStack(){
    System.out.println("Hapus Element: " + stack.pop());
    }   
}

class Tes2 extends Tes1{
    
    public void Atas(){
    System.out.println("Nilai Paling Atas: " + stack.peek());
    }
    
    public void Run(){
    System.out.println(stack);
    }
}


public class TestStack{

        public static void main(String[] args) {

        Tes2 stack1 = new Tes2();
        System.out.println("List Kosongan");
        stack1.Run();
        System.out.println("Fungsi Tambah Nilai");
        stack1.TambahNilai(2);
        stack1.TambahNilai(3);
        stack1.TambahNilai(4);
        stack1.TambahNilai(5);
        stack1.TambahNilai(6);
        stack1.Run();
        System.out.println("Fungsi Kurang Nilai");
        stack1.HapusStack();
        stack1.HapusStack();
        stack1.Run();
        System.out.println("Antrian Nilai");
        stack1.Run();
        stack1.Atas();
    }
}