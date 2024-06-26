package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {
	
	//declarando constante com static
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss"); 

	private Date moment;
	private String title;
	private String content;
	private Integer likes;

	private List<Comment> comments = new ArrayList<>(); //instanciar a lista de comentários, um post pode ter vários comentarios.

	public Post() {
	}

	public Post(Date moment, String title, String content, Integer likes) { //não adiciona lista no construtor
		this.moment = moment;
		this.title = title;
		this.content = content;
		this.likes = likes;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Integer getLikes() {
		return likes;
	}

	public void setLikes(Integer likes) {
		this.likes = likes;
	}

	public List<Comment> getComments() {
		return comments;
	}
	
				//add um com e recebe o médoto comment 
	public void addComment(Comment comment) { // substitui o metodo set da lista, para não substituir a lista existente
		comments.add(comment);
	}
			//remove o comentario
	public void removeComment(Comment comment) {
		comments.remove(comment);
	}
	public String toString() {
		StringBuilder sb = new StringBuilder(); //concatenar comentários
		sb.append(title + "\n");
		sb.append(likes);
		sb.append(" Likes - ");
		sb.append(sdf.format(moment) + "\n");
		sb.append(content + "\n");
		for (Comment c : comments) {
			sb.append("commented for " +c.getUser() +  "\n" + c.getText() + "\n");
		}
		return sb.toString();
	}
	
	
}
