package autotest.api.gyApi.bean;

import autotest.api.gyApi.bean.TestOrder.OrderLineListLogin;
import java.util.ArrayList;
import java.util.List;

public class Test {
  public void testMethod(){
    TestOrder bean=new TestOrder();
    List<OrderLineListLogin> list=new ArrayList<OrderLineListLogin>();
    OrderLineListLogin login=new OrderLineListLogin();
    login.setQty(10);
    login.setSkuCode("123");
    list.add(login);
    bean.setOrderLineList(list);
  }

}
