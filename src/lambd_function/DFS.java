import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;

public class DFS {
    static List<List<Integer>> adj;
    static boolean[] vis;
    static int[] maxDepth;
    static int farthestNode;

    public static void main(String[] args) {
        // Initialize adjacency list
        adj = new ArrayList<>();
        adj.add(new ArrayList<>()); // Node 0 is not used

        // Populate adjacency list with edges
        adj.add(Arrays.asList(2, 3)); // Node 1
        adj.add(Arrays.asList(1, 4)); // Node 2
        adj.add(Arrays.asList(1));    // Node 3
        adj.add(Arrays.asList(2));    // Node 4

        int startNode = 1;
        vis = new boolean[adj.size()];
        maxDepth = new int[]{0};
        farthestNode = -1;

        // Helper method for DFS
        BiConsumer<Integer, Integer> dfsHelper = null;
        dfsHelper = (a, depth) -> {
            vis[a] = true;
            if (depth > maxDepth[0]) {
                maxDepth[0] = depth;
                farthestNode = a;
            }
            for (Integer x : adj.get(a)) {
                if (!vis[x]) {
                    //canout use this because of restriction of usage of normal variable inside lambda function
//                    dfsHelper.accept(x, depth + 1);
                }
            }
        };

        // Call DFS with the lambda function
        dfsHelper.accept(startNode, 1);

        System.out.println("Farthest node: " + farthestNode);
        System.out.println("Max depth: " + maxDepth[0]);
    }
}
