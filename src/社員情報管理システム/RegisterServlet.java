package 社員情報管理システム;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		this.doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		//		リクエストパラメータの取得
		request.setCharacterEncoding("UTF-8");

		String name = request.getParameter("name");
		String call = request.getParameter("call");
		String gender = request.getParameter("gender");

		//		リクエストパラメータのチェック
		String errorMsg = "";
		if (name == null || name.length() == 0) {
			errorMsg += ":名前が入力されていません<br>";
		}
		if (call == null || call.length() == 0) {
			errorMsg += ":名前の読み方が入力されていません<br>";
		}
		if (gender == null || gender.length() == 0) {
			errorMsg += "性別が選択されていません<br>";
		} else {
			if (gender.equals("0")) {
				gender = "男性";
			}
			if (gender.equals("1")) {
				gender = "女性";
			}
		}

		//		成功時、表示メッセージ
		String msg = name + "さん" + "を登録しました";
		if (errorMsg.length() != 0) {
			msg = errorMsg;
		}

		//		HTMLで出力
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE html>");
		out.println("<head>");
		out.println("<meta charset=\"UTF-8\">");
		out.println("<title>社員情報登録結果</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<p>" + msg + "</p>");
		out.println("</body>");
		out.println("</html>");

	}

}
