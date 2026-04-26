public class Creation {

    static int[] tree;

    // Initialize segment tree
    public static void init(int n) {
        tree = new int[4 * n];
    }

    // Build segment tree
    public static int buildST(int[] arr, int i, int start, int end) {

        // Base case (leaf node)
        if (start == end) {
            tree[i] = arr[start];
            return tree[i];
        }

        int mid = (start + end) / 2;

        // Left subtree
        int left = buildST(arr, 2 * i + 1, start, mid);

        // Right subtree
        int right = buildST(arr, 2 * i + 2, mid + 1, end);

        // Parent node = sum of children
        tree[i] = left + right;

        return tree[i];
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};

        int n = arr.length;

        init(n);

        buildST(arr, 0, 0, n - 1);

        // Print segment tree
        for (int i = 0; i < tree.length; i++) {
            System.out.print(tree[i] + " ");
        }
    }
}

