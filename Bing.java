import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Bing {
    public static void main(String[] args) {
        Trie dict = new Trie();

        Scanner scan = new Scanner(System.in);
        int inputs = scan.nextInt();
        for (int i = 0; i < inputs; i++) {
            String in = scan.next();
            System.out.println(dict.add(in));;
        }
    }
}

class TrieNode{
    private char c;
    private int n;
    private boolean leaf;
    HashMap<Character, TrieNode> children = new HashMap<>();

    public TrieNode(){
    }

    public TrieNode(char c){
        this.c = c;
        n = 1;
    }

    public void inc(){
        this.n++;
    }

    public int num(){
        return this.n;
    }

    public void setLeaf(){
        this.leaf = true;
    }
}

class Trie{
    private TrieNode root;

    public Trie(){
        root = new TrieNode();
    }

    public int add(String word){
        HashMap<Character, TrieNode> children = root.children;
        int out = 0;
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);

            TrieNode t;

            if(children.containsKey(c)){
                t = children.get(c);
                t.inc();
            }
            else{
                t = new TrieNode(c);
                children.put(c, t);
            }

            children = t.children;
            out = t.num();
            if(i == word.length()-1){
                t.setLeaf();

            }
        }
        return out-1;
    }

//    public int startsWithCount(String prefix){
//        TrieNode t = searchNode(prefix);
//        if(searchNode(prefix) == null){
//            return 0;
//        }
//        else return t.num()-1;
//    }

//    public TrieNode searchNode(String search){
//        Map<Character, TrieNode> children = root.children;
//        TrieNode t = null;
//
//        for (int i = 0; i < search.length(); i++) {
//            char c = search.charAt(i);
//            if(children.containsKey(c)){
//                t = children.get(c);
//                children = t.children;
//            }
//            else{
//                return null;
//            }
//        }
//        return t;
//    }
}
