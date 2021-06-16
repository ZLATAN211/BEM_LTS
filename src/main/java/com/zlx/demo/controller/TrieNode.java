package com.zlx.demo.controller;




import java.util.LinkedList;

public class TrieNode {
    char content;  //装node中的内容
    boolean isEnd;  //是否是单词结尾
    int count;  //这个单词的这个字母下面分支的个数

    LinkedList<Node> childlist;   //子list

    public TrieNode(char c){
        childlist = new LinkedList<Node>();
        isEnd=false;
        content=c;
        count=0;
    }

    /**
     * 遍历一下这个node中LinkedList中是否有这个字母，有就意味着可以继续查找下去，没有就没有
     */
    public TrieNode subNode(char c){
        if (childlist!=null){
            for (Node eachChild:childlist){
                if (eachChild.content=c){
                    return eachChild;
                }
            }
        }
        return null;
    }
}
