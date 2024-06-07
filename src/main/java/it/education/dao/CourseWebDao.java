package it.education.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import it.education.entity.Course;
import it.education.utils.JdbcUtil;


public class CourseWebDao {

	public void addCourse(Course CourseRef) {
		String sqlQuery = "insert into Course_Master values(?,?,?,?,?)";
		try (Connection dbConnection = JdbcUtil.buildConnection();
				PreparedStatement pstmt = dbConnection.prepareStatement(sqlQuery);)

		{
//				Retrieving

			int course_id = CourseRef.getCourse_id();
			String course_name = CourseRef.getCourse_name();
			String course_provider = CourseRef.getCourse_provider();
			int course_duration = CourseRef.getCourse_duration();
			int course_fees = CourseRef.getCourse_fees();

			// setting the data
			pstmt.setInt(1, course_id);
			pstmt.setString(2, course_name);
			pstmt.setString(3, course_provider);
			pstmt.setInt(4, course_duration);
			pstmt.setInt(5, course_fees);

			int updateCount = pstmt.executeUpdate();
			System.out.println(updateCount + " record inserted.");
		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

}
