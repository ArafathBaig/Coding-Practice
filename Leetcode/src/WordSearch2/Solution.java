package WordSearch2;

import java.util.ArrayList;
import java.util.List;

class Solution {

    int dir[][] = {{-1, 0}, {0,-1}, {1,0},{0,1}};
    public List<String> findWords(char[][] board, String[] words) {

        if(board == null || board.length == 0)
            return new ArrayList<>();

        Trie trieStructure = generateTrie(words);
        List<String> result = new ArrayList<>();
        allPossibleWords(board,trieStructure, result);
        // traverseTrie(trieStructure);


        return result;
    }

    private void allPossibleWords(char[][] b , Trie trie, List<String> result){

        int m= b.length, n = b[0].length;

        boolean vis[][] = new boolean[m][n];
        for(int i = 0 ;i < m ;i++){
            for(int j = 0 ; j< n;j++){

                int index = b[i][j] - 'a';

                if(trie.trieNode[index] != null){
                    traverse(b,trie,i,j,vis,result);
                }
            }
        }

    }

    private void traverse(char b[][], Trie trie, int i, int j , boolean vis[][], List<String> list){

        if(i >= b.length || i < 0 || j >= b[0].length || j < 0 || vis[i][j]
                || trie.trieNode[b[i][j] - 'a'] == null)
            return;

        vis[i][j] = true;

        for(int d[] : dir){
            traverse(b, trie.trieNode[b[i][j] - 'a'].next, i+d[0], j+d[1], vis, list);
        }

        if(trie.trieNode[b[i][j] - 'a'].end == 1){
            list.add(trie.trieNode[b[i][j] - 'a'].word);
            trie.trieNode[b[i][j] - 'a'].end = 0;
        }

        vis[i][j] = false;

    }

    private void traverseTrie(Trie trieStructure){

        if(trieStructure == null)
            return;


        Trie temp = trieStructure;
        for(int i = 0; i < 26; i++){

            if(temp.trieNode[i] != null){
                System.out.println(i);
                if(temp.trieNode[i].end == 1)
                    System.out.println(temp.trieNode[i].word);

                traverseTrie(temp.trieNode[i].next);
            }
        }

        System.out.println("---------");
    }

    private Trie generateTrie(String allWords[]){

        Trie trie = new Trie();
        for(String currentWord : allWords){

            Trie temp = trie;
            for(int i = 0; i < currentWord.length() ;i++){

                char current = currentWord.charAt(i);
                int index = current - 'a';

                if(temp.trieNode[index] == null){
                    temp.trieNode[index] = new TrieNode(current, i == currentWord.length()-1, currentWord);
                    temp = temp.trieNode[index].next;
                }
                else{

                    if(i == currentWord.length()-1){
                        temp.trieNode[index].end = 1;
                        temp.trieNode[index].word = currentWord;
                    }
                    temp = temp.trieNode[index].next;
                }
            }
        }

        return trie;
    }


    class Trie{
        TrieNode[] trieNode;

        public Trie(){
            trieNode = new TrieNode[26];
        }
    }

    class TrieNode{
        char data;
        int end = 0;
        String word = "";
        Trie next = null;

        public TrieNode(char data, boolean endd,String word){
            this.data = data;

            if(endd){
                this.end = 1;
                this.word = word;
            }

            if(next == null)
                this.next = new Trie();
        }
    }
}

