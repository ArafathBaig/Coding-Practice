class StreamChecker {
    private Trie trieNode;
    StringBuilder sb;
    public StreamChecker(String[] words) {
        trieNode = new Trie();
        constructTrie(words);
        sb = new StringBuilder();
    }
    
    public boolean query(char letter) {
        
        sb.append(letter);
        Trie tempNode = trieNode;
        
        for(int i = sb.length() -1 ;i >= 0 && tempNode != null ;i--){
            
            char c = sb.charAt(i);
            int index = c - 'a';
            tempNode = tempNode.trie[index];
            if(tempNode != null && tempNode.word == 1)
                return true;
        }
        return false;
        
    }
    
    private void constructTrie(String[] words){
        
        for(String s : words){
            Trie temp = trieNode;
            for(int i = s.length()-1; i >= 0 ;i--){
                
                char c = s.charAt(i);
                int index = c-'a';
                
                if(temp.trie[index] == null)
                    temp.trie[index] = new Trie();
                
                temp = temp.trie[index];
            }
            
            temp.word = 1;
        }
    }
}

class Trie{
    
    Trie[] trie;
    int word;
    
    public Trie(){
        word = 0;
        trie = new Trie[26];
    }
}

/**
 * Your StreamChecker object will be instantiated and called as such:
 * StreamChecker obj = new StreamChecker(words);
 * boolean param_1 = obj.query(letter);
 */