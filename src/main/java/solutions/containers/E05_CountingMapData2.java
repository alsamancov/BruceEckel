//: containers/E05_CountingMapData2.java
/****************** Exercise 5 ******************
 * Modify CountingMapData.java to fully implement
 * the flyweight by adding a custom EntrySet class
 * like the one in Countries.java.
 ************************************************/
package solutions.containers;
import java.util.*;

class CountingMapData extends AbstractMap<Integer,String> {
  private int size;
  private static String[] chars =
    "A B C D E F G H I J K L M N O P Q R S T U V W X Y Z"
    .split(" ");
  public CountingMapData(int size) {
    if(size < 0) this.size = 0;
    this.size = size;
  }
  private class Entry implements Map.Entry<Integer,String> {
    int index;
    Entry(int index) { this.index = index; }
    public boolean equals(Object o) {
      return o instanceof Entry &&
             index == ((Entry)o).index;
    }
    public Integer getKey() { return index; }
    public String getValue() {
      return
        chars[index % chars.length] +
        Integer.toString(index / chars.length);
    }
    public String setValue(String value) {
      throw new UnsupportedOperationException();
    }
    public int hashCode() {
      return Integer.valueOf(index).hashCode();
    }
  }
  class EntrySet 
  extends AbstractSet<Map.Entry<Integer,String>> {
    public int size() { return size; }
    private class Iter
    implements Iterator<Map.Entry<Integer,String>> {
      private Entry entry = new Entry(-1);
      public boolean hasNext() {
        return entry.index < size - 1;
      }
      public Map.Entry<Integer,String> next() {
        entry.index++;
        return entry;
      }
      public void remove() {
        throw new UnsupportedOperationException();
      }
    }
    public
    Iterator<Map.Entry<Integer,String>> iterator() {
      return new Iter();
    }
  }
  private Set<Map.Entry<Integer,String>> entries =
    new EntrySet();
  public Set<Map.Entry<Integer,String>> entrySet() {
    return entries;
  }
}

public class E05_CountingMapData2 {
  public static void main(String[] args) {
    System.out.println(new CountingMapData(60));
  }
} /* Output:
{0=A0, 1=B0, 2=C0, 3=D0, 4=E0, 5=F0, 6=G0, 7=H0, 8=I0, 9=J0, 10=K0, 11=L0, 12=M0, 13=N0, 14=O0, 15=P0, 16=Q0, 17=R0, 18=S0, 19=T0, 20=U0, 21=V0, 22=W0, 23=X0, 24=Y0, 25=Z0, 26=A1, 27=B1, 28=C1, 29=D1, 30=E1, 31=F1, 32=G1, 33=H1, 34=I1, 35=J1, 36=K1, 37=L1, 38=M1, 39=N1, 40=O1, 41=P1, 42=Q1, 43=R1, 44=S1, 45=T1, 46=U1, 47=V1, 48=W1, 49=X1, 50=Y1, 51=Z1, 52=A2, 53=B2, 54=C2, 55=D2, 56=E2, 57=F2, 58=G2, 59=H2}
*///:~
