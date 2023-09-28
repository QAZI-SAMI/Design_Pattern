package pk.cuiatd.dp.chain.lab;

public abstract class BaseApprover implements Approver{
	protected Approver next = null;
	
    /**
     *
     * @param next
     */
    @Override
	public void setNext(Approver next){
		this.next = next;
	}
}
