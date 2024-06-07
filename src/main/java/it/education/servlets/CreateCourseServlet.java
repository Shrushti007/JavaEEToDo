package it.education.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import it.education.dao.CourseWebDao;
import it.education.entity.Course;

/**
 * Servlet implementation class CreateCourseServlet
 */
@WebServlet(
		urlPatterns = {"/CreateNewCourse"},
		name="myCreateCourseServlet"
		
		)
public class CreateCourseServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		String CourseId = request.getParameter("course_id");
		String CourseName = request.getParameter("course_name");
		String CourseProvider = request.getParameter("course_provider");
		String CourseDuration = request.getParameter("course_duration");
		String CourseFees = request.getParameter("course_fees");
		
		int CId= Integer.parseInt(CourseId);
		int CDur=Integer.parseInt(CourseDuration);
		int CFee=Integer.parseInt(CourseFees);
		
		
		
		Course currentCourse = new Course(CId,CourseName,CourseProvider,CDur,CFee);
		 
		CourseWebDao course = new CourseWebDao();
		course.addCourse(currentCourse);
		System.out.println(currentCourse);

	}

	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
