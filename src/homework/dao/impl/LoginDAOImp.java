package homework.dao.impl;

//实现底层（数据访问层）层操作员登录系统接口

import homework.dao.ILoginDAO;
import homework.model.Operator;
import org.hibernate.SessionFactory;

public class LoginDAOImp implements ILoginDAO {
	// hibernate　SessionFactory对象，由spring注入．
	private SessionFactory factory;

	// get/set方法在spring注入时使用
	public SessionFactory getFactory() {
		return factory;
	}

	public void setFactory(SessionFactory factory) {
		this.factory = factory;
	}

	// 判断是操作员是否存在
	public Operator isOperator(String operatorName, String operatorPwd) {
		Operator operator = null;
		System.out.println("name "+operatorName);
		System.out.println("password "+operatorPwd);

        if(operatorName.equals("admin")&&operatorPwd.equals("123"))
        {
            operator = new Operator(1, "admin", "123", 1);
        }
/*		Session session = factory.openSession();
		Transaction ts = null;
		ts = session.beginTransaction();
		// String
		// query="select * from userInfo where userName=? and userPassword=?";
		try {
			Query query = session
					.createQuery("from Operator as a where a.operatorName='"
							+ operatorName + "' and a.operatorPwd='"
							+ operatorPwd + "'");
			List<Operator> list = query.list();
			Iterator it = list.iterator();
			if (!Hibernate.isInitialized(list))
				Hibernate.initialize(list);
			if (it.hasNext()) {
				operator = (Operator) it.next();
			}
		} catch (Exception e) {
			// TODO: handle exception
		}

		ts.commit();
		session.close();*/
		return operator;
	}

	
}
