class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int[] array=new int[queries.length];
        // int j=0;
        // for(int[] i:queries){
        //     int a=0;
        //     if(i[0]==i[1]){
        //         array[j]=arr[i[0]];
        //         j++;
        //         continue;
        //     }
        //     for(int k=i[0];k<=i[1];k++){
        //         a^=arr[k];
        //     }
        //     array[j++]=a;
        // }
        // return array;
        int[] xors = new int[arr.length + 1];

        for (int i = 0; i < arr.length; ++i)
        xors[i + 1] = xors[i] ^ arr[i];

        int i = 0;
        for (int[] query : queries) {
        final int left = query[0];
        final int right = query[1];
        array[i++] = xors[left] ^ xors[right + 1];
        }

        return array;
    }
}
