public class Exe{
	public static void main(String[] args){
		DAO d2 = new DAO();
		/*
		String sql = "INSERT INTO teste (id, nome, email) VALUES(?, ?, ?)";
		
		d2.insert(sql, 1, "...","...");
		d2.insert(sql, 2, "...","...");
		d2.insert(sql, 3, "...", "...");
		
		
		String sql1 = "DELETE FROM teste WHERE id= ?";
		
		d2.delete(sql1, 1);
		
		
		String sql2 = "UPDATE teste SET nome = ?,email = ? WHERE id = ?";
		
		d2.delete(sql2, "...","...", 2);
		*/
		
		String sql3 = "SELECT * FROM teste";// where id = ?";
		
		for(Controler c : d2.ler(sql3)){
			c.imprimir();
		 }

		// d2.close();
	 }
}