package com.zlx.demo.controller;

//时间复杂度 O(len)

import javax.xml.soap.Node;

public class TrieTree {

    private TrieNode root;  //根

    /**
     * 构造函数，生成根
     */
    public TrieNode(){
        root=new TrieNode('');
    }

    /**
     * 插入函数，先判断是否有这个单词了（通过每个单词字母来判断），如果没有，挨着顺序判断是否有这个字母了，
     * 如果有这个字母，继续判断下一个，当没有这个字母时，对这个字母new一个node对象，放入到上一个字母的
     * LinkedList里面
     * @param word  要插入的单词
     */
    public void insert(String word){
        //如果找到就返回
        if (search(word)) return;

        TrieNode current=root;
        for (int i=0;i<word.length();i++){
            TrieNode child=current.subNode(word.charAt(i));
            if (child!=null){
                current=child;
            }else {
                current.childlist.add((Node) new TrieNode(word.charAt(i)));
                current=current.subNode(word.charAt(i));
            }
            //单词下面分支数++
            current.count++;
        }
        //在单词最后字母那里结束了
        current.isEnd=true;
    }



    private boolean search(String word) {
        Node current
    }
}
