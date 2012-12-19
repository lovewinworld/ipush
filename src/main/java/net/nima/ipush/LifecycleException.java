/**
 * 
 */
package net.nima.ipush;

/**
 * 
 * 
 * @author Kevin Lee
 *
 */
public final class LifecycleException extends Exception {
	
	public LifecycleException() {
		super();
    }
	
	public LifecycleException(String message){
		super(message);
	}
	
	public LifecycleException(Throwable cause){
		super(cause);
	}
	
	public LifecycleException(String message, Throwable cause){
		super(message, cause);
	}

}
