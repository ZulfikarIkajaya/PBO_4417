import java.util.Queue;
import java.util.*;

class Coba1{
    Queue<Integer> TestQueue = new LinkedList<>();
    
    public void TambahNilai(Integer i){
    TestQueue.add(i);
    }
    
    public void HapusNilai(Integer i){
    TestQueue.remove(i);
    }
}

class Coba2 extends Coba1{
    
    public void iterasi(){
    Iterator iterator = TestQueue.iterator();
  
    while (iterator.hasNext()) {
        System.out.print(iterator.next() + " ");
    }
    }
    
    public void CekDataAtas(){
    System.out.println("Nilai Paling Atas: " + TestQueue.peek());
    }
    
    public void Run(){
    System.out.println(TestQueue);
    }

}

public class TestQueue{
    public static void main(String[] args) {

        Coba2 TestQueue1 = new Coba2();
        System.out.println("List Kosongan");
        TestQueue1.Run();
        System.out.println("Fungsi Tambah Nilai");
        TestQueue1.TambahNilai(2);
        TestQueue1.TambahNilai(3);
        TestQueue1.TambahNilai(4);
        TestQueue1.TambahNilai(5);
        TestQueue1.TambahNilai(6);
        TestQueue1.Run();
        System.out.println("Kurangi Nilai");
        TestQueue1.HapusNilai(7);
        TestQueue1.HapusNilai(8);
        TestQueue1.Run();
        System.out.println("Antrian Nilai");
        TestQueue1.iterasi();
        System.out.println("");
        TestQueue1.CekDataAtas();
        
    }
    
}