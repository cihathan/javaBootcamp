package homework.models;

import java.util.Date;

public class LectureComment {
	
	public LectureComment() {}
	
	public LectureComment(int id, int lectureId, int userId, Date date, int parentId) {
		this.id = id;
		this.lectureId = lectureId;
		this.userId = userId;
		this.date = date;
		this.parentId = parentId;
	}

	public int id;
	public int lectureId;
	public int userId;
	public Date date;
	public int parentId;
	
}
