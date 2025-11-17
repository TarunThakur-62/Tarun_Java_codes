package collection;
import java.util.*;
	class Parcel implements Comparable<Parcel> {
	    String id;
	    int priority;
	    Parcel(String id, int p){ this.id=id; this.priority=p; }
	    public int compareTo(Parcel o){ return o.priority - this.priority; }
	}
	public class devilery_rout {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        PriorityQueue<Parcel> high = new PriorityQueue<>();
	        Queue<Parcel> normal = new LinkedList<>();
	        Set<String> ids = new HashSet<>();
	        List<String> done = new ArrayList<>();

	        while(true){
	            System.out.println("\n1 Add  2 Assign  3 Done  4 Show  5 Exit");
	            switch(sc.nextInt()){
	                case 1 -> {
	                    System.out.print("ID: "); String id = sc.next();
	                    if(ids.contains(id)) { System.out.println("Duplicate!"); break; }
	                    System.out.print("Priority (1-5): "); int p=sc.nextInt();
	                    ids.add(id);
	                    if(p>=3) high.add(new Parcel(id,p));
	                    else normal.add(new Parcel(id,p));
	                }
	                case 2 -> {
	                    if(!high.isEmpty()) System.out.println("Assigned: "+high.poll().id);
	                    else if(!normal.isEmpty()) System.out.println("Assigned: "+normal.poll().id);
	                    else System.out.println("No parcels");
	                }
	                case 3 -> {
	                    System.out.print("Completed ID: "); done.add(sc.next());
	                }
	                case 4 -> System.out.println("Delivered: "+done);
	                case 5 -> { System.out.println("Bye Thakur Sahab ❤️"); return; }
	            }
	        }
	    }
	}