// 2747. Count Zero Request Servers


import java.util.*;

class Solution {
    public int[] countServers(int n, int[][] logs, int x, int[] queries) {

        // Step 1: Sort logs by request time
        Arrays.sort(logs, (a, b) -> Integer.compare(a[1], b[1]));

        int m = queries.length;
        int[] ans = new int[m];

        // Step 2: Store query indices
        Integer[] indices = new Integer[m];

        for (int i = 0; i < m; i++) {
            indices[i] = i;
        }

        // Sort indices according to query values
        Arrays.sort(indices, (a, b) ->
            Integer.compare(queries[a], queries[b])
        );

        // Step 3: Maintain server request frequencies
        HashMap<Integer, Integer> map = new HashMap<>();

        int left = 0;
        int right = 0;

        // Step 4: Process queries in sorted order
        for (int idx : indices) {

            int q = queries[idx];
            int start = q - x;

            // Add requests that fall before or at query time
            while (right < logs.length &&
                   logs[right][1] <= q) {

                int serverId = logs[right][0];

                map.put(serverId,
                    map.getOrDefault(serverId, 0) + 1);

                right++;
            }

            // Remove requests outside the time window
            while (left < right &&
                   logs[left][1] < start) {

                int serverId = logs[left][0];

                map.put(serverId, map.get(serverId) - 1);

                if (map.get(serverId) == 0) {
                    map.remove(serverId);
                }

                left++;
            }

            // Inactive servers = total - active servers
            ans[idx] = n - map.size();
        }

        return ans;
    }
}
