package collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;
record Policy(String policyId, String policyHolder, int expiryYear) {}
public class unique_policies {
	    private final Set<Policy> quickLookupPolicies = new HashSet<>();
	    private final Set<Policy> orderedPolicies = new LinkedHashSet<>();
	    private final Set<Policy> sortedPolicies = new TreeSet<>(
	        Comparator.comparingInt(Policy::expiryYear)
	                  .thenComparing(Policy::policyId)    
	    );
	    public void addPolicy(Policy policy) {
	        quickLookupPolicies.add(policy);
	        orderedPolicies.add(policy);
	        sortedPolicies.add(policy);
	    }
	    public static void main(String[] args) {
	        unique_policies manager = new unique_policies();
	        Policy p1 = new Policy("A101", "Alice", 2028);
	        Policy p2 = new Policy("B202", "Bob", 2026);
	        Policy p4 = new Policy("D404", "David", 2024);
	        Policy p3 = new Policy("C303", "Charlie", 2030);

	        manager.addPolicy(p1);
	        manager.addPolicy(p2);
	        manager.addPolicy(p4);
	        manager.addPolicy(p3);
	        manager.addPolicy(new Policy("B202", "Duplicate", 2099));

	        System.out.println("--- 1. HashSet (Quick Lookups - Random Order) ---");
	        manager.quickLookupPolicies.forEach(System.out::println);
	        
	        System.out.println("\n--- 2. LinkedHashSet (Order of Insertion) ---");
	        manager.orderedPolicies.forEach(System.out::println);
	        
	        System.out.println("\n--- 3. TreeSet (Sorted by Expiry Year) ---");
	        manager.sortedPolicies.forEach(System.out::println);
	    }
	}