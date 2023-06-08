package com.mycompany.study.ch06.third;

import java.util.ArrayList;
import java.util.List;

public class Borad {

	    private List<String> postList;

	    public Borad() {
	    	postList = new ArrayList<>();
	    }

	    public void addBorad(String post) {
	    	postList.add(post);
	    }

	    public void delBorad(String post) {
	    	postList.remove(post);
	    }

	    public void viewPosts() {
	        for (String post : postList) {
	            System.out.println(post);
	        }
	    }

	    public static void main(String[] args) {
	        Borad board = new Borad();

	        board.addBorad("첫 번째 게시글");
	        board.addBorad("두 번째 게시글");

	        board.viewPosts();

	        board.delBorad("첫 번째 게시글");

	        board.viewPosts();
	}
}
