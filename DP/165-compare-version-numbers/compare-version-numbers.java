class Solution {
    public int compareVersion(String version1, String version2) {
        int i, j;

        // Create lists to store the integer parts of version strings version1 and version2
        List<Integer> v1Parts = new ArrayList<>();
        List<Integer> v2Parts = new ArrayList<>();

        // Extract integer parts from version string version1
        for (i = 0; i < version1.length(); i++) {
            StringBuilder part = new StringBuilder();
            j = i;
            while (j < version1.length() && version1.charAt(j) != '.') {
                part.append(version1.charAt(j));
                j++;
            }

            i = j;
            v1Parts.add(Integer.parseInt(part.toString())); // Convert the extracted string to an integer and add to list v1Parts
        }

        // Extract integer parts from version string version2
        for (i = 0; i < version2.length(); i++) {
            StringBuilder part = new StringBuilder();
            j = i;
            while (j < version2.length() && version2.charAt(j) != '.') {
                part.append(version2.charAt(j));
                j++;
            }

            i = j;
            v2Parts.add(Integer.parseInt(part.toString())); // Convert the extracted string to an integer and add to list v2Parts
        }

        // Compare the corresponding integer parts of versions version1 and version2
        i = 0;
        j = 0;
        while (i < v1Parts.size() && j < v2Parts.size()) {
            if (v1Parts.get(i) > v2Parts.get(j)) return 1; // If version version1 is greater than version version2, return 1
            else if (v1Parts.get(i) < v2Parts.get(j)) return -1; // If version version1 is less than version version2, return -1
            i++;
            j++;
        }

        // Handle cases where one version string has more integer parts than the other and the remaining parts are all 0
        while (i < v1Parts.size() && v1Parts.get(i) == 0) i++;
        while (j < v2Parts.size() && v2Parts.get(j) == 0) j++;

        // Check if there are remaining non-zero integer parts in version version1
        if (i < v1Parts.size()) return 1; // If version version1 has more non-zero parts, it is greater, so return 1
        // Check if there are remaining non-zero integer parts in version version2
        if (j < v2Parts.size()) return -1; // If version version2 has more non-zero parts, it is greater, so return -1
        // Both versions are equal
        return 0;
    }
}