package zaj07_03_BookAnalysysWithRegex;

import java.util.*;

public class TreeSeet {
    public static void main(String[] args) {
        Integer[] nums = {2,4,1,6,3,7,9,5};
        SortedSet<Integer> tree = new TreeSet<>(Arrays.asList(nums));
        System.out.println(tree.first());
        System.out.println(tree.last());
        System.out.println(tree.add(1));
        System.out.println(tree.add(11));
        printAll(tree.headSet(7));


        ////////////////////////
        TreeMap<String,Double> treeMap = new TreeMap<>();
        treeMap.put("Paradise Lost", 23.43);
        treeMap.put("Golden Treasury", 12.43);
        treeMap.put("Holincostam", 7.68);
        treeMap.put("Kapitan bomba", 6.3);
        printAll2(treeMap);
        treeMap.put("Paradise Lost", 40.43);
        printAll2(treeMap);
        treeMap.put("Paradise Regained", 23.43);
        printAll2(treeMap);

        ////////
        Map<String, String> treeMap2 = new TreeMap<>();
        treeMap2.put("Poland","Warsaw");
        treeMap2.put("Germany","Berlin");
        printAll3(treeMap2);
        ////////
        Integer[] nums2 = {2,4,1,6,3,7,9};
        List<Integer> lista = new ArrayList<>(Arrays.asList(nums2));
        //lub   -       List<Integer> lista = Arrays.asList(new Integer[] {1,3,5,7,9});
        lista.add(1);
        lista.add(2);

        System.out.println(avg(lista));
        System.out.println(lista);
        System.out.println(treeMap2);
        System.out.println(tree);
////////////////////////////
        Map<String,String> map2 = new HashMap<>();
        map2.put("Polska", "Warszawa");
        map2.put("Niemcy", "Berlin");
        map2.put("Francja", "Paryż");

        for(String s : map2.keySet()){
            System.out.print(s + "\t");
        }
        System.out.println();
        for(String s : map2.values()){
            System.out.print(s + "\t");
        }
        System.out.println();
        System.out.println(map2);

        System.out.println("Podaj liczbę ciągu fibonacciego");
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        List<Long> fibonacci = new ArrayList<>(length);
        long first=0, second=1, sum=0;
        fibonacci.add(first);
        fibonacci.add(second);
        for (int i = 2; i < length; i++) {
            sum=first+second;
            fibonacci.add(sum);
            first=second;
            second=sum;
        }
        System.out.println(fibonacci);
/////////////////////
        Random random = new Random();
        System.out.println("Jak wielka ma być tablica?");
        int wielkosc = scanner.nextInt();
        System.out.println("Jak jest dolna granica losowanych wartosci?");
        int dolna = scanner.nextInt();
        System.out.println("Jak jest gorna granica losowanych wartosci?");
        int gorna = scanner.nextInt();
        List<Integer> listX = new ArrayList<>();
        for (int i = 0; i < wielkosc; i++) {
            listX.add(random.nextInt(gorna-dolna+1)+dolna);
        }
        System.out.println(listX);
    Integer[] num1 = {2,5,5,8,4,6,1,5,5,8,4,4,7,9,5,1,2,4,86,32,1};
    Integer[] num2 = {2,5,5,8,4,6,1,5,5,8,4,4,7,9,5,1,2,4,86,32,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1};
     List<Integer> list1 = new ArrayList(Arrays.asList(num1));
     List<Integer> list2 = new ArrayList(Arrays.asList(num2));
        System.out.println(sumaList(list1, list2));


            Set<Double> tree2 = new HashSet<>();
            while (true){
                System.out.println("Podaj liczbę (podając - konczysz podawanie)");
                String c = scanner.next();
                if(c.equals("-")) break;
                tree2.add(Double.parseDouble(c));
            }
            System.out.println(tree.size());
//////////////////////////////////
        /*
        Map<String,String> partnersMap = new HashMap<>();
       // Scanner scn = new Scanner(System.in);
        String person;
        String partner;
        while(true) {
            System.out.println("Write a persons name:");
            person = scanner.next();
            if (person.equals("-") || person.isEmpty()){
                break;
            }
            System.out.println("Write this persons partner name:");
            partner = scanner.next();
            if (partner.equals("-") || partner.isEmpty()){
                break;
            }
            partnersMap.put(person, partner);
        }
        System.out.println(partnersMap);
        System.out.println("give name:");
        person=scanner.next();
        System.out.println(partnersMap.get(person));*/

        //////////////////
    }
    public static void printAll(SortedSet<Integer> tree){
        for(int s: tree){
            System.out.println(s);
        }
        System.out.println();
    }
    public static void printAll2(TreeMap<String,Double> treeMap){
        for(Map.Entry<String,Double> et:treeMap.entrySet()){
            System.out.println(et.getKey()+": "+et.getValue());
        }
        System.out.println();
    }
    public static void printAll3(Map<String,String> treeMap){
        for(Map.Entry<String, String> et: treeMap.entrySet()){
            System.out.println(et.getKey()+": "+et.getValue());
        }
        System.out.println();
    }


    public static double avg(List<Integer> list){
        int i=0;
        int sum=0;
        for(Integer liczba : list){
            sum+=liczba;

        }
        return (double)sum/list.size();
    }
public static List<Integer> sumaList(List<Integer> a, List<Integer> b) {
    List<Integer> r = new ArrayList();
    int i, j;
    if (a.size() < b.size()){
        for ( i = 0; i < a.size(); i++) {
            r.add(a.get(i)+b.get(i));
        }
        for (j = i; j < b.size(); j++) {
            r.add(b.get(j));
        }
    }
    else{
        for ( i = 0; i < a.size(); i++) {
            r.add(a.get(i)+b.get(i));
        }
        for (j = i; j < a.size(); j++) {
            r.add(a.get(j));
        }
    }
    return r;
}
}
