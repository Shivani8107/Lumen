package com.serialization;
import java.io.*;

public class CallQuality {
		
		public void saveCallQuality(CallQuality callQuality) {
	        try {
	            FileOutputStream fileOut = new FileOutputStream(callQuality.getCallId() + ".dat");
	            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
	            objectOut.writeObject(callQuality);
	            objectOut.flush();
	            objectOut.close();
	            System.out.println("Call quality data saved.");
	        } catch (FileNotFoundException e) {
	            System.out.println(e);
	        } catch (IOException e1) {
	            System.out.println(e1);
	        }
	    }

	    private String getCallId() {
			// TODO Auto-generated method stub
			return null;
		}

		public CallQuality loadCallQuality(int callId) {
	        CallQuality callQuality = null;
	        try {
	            FileInputStream fileIn = new FileInputStream( callId + ".dat");
	            ObjectInputStream objectIn = new ObjectInputStream(fileIn);
	            callQuality = (CallQuality) objectIn.readObject();

	            objectIn.close();
	        } catch (FileNotFoundException e1) {
	            System.out.println(e1);
	        } catch (IOException e2) {
	            System.out.println(e2);
	        } catch (ClassNotFoundException e) {
	            System.out.println(e);
	        }
	        return callQuality;
	    }

	    public static void main(String[] args) {
	        CallQuality callQuality = new CallQuality();
	        caller obj = new caller(1,300,"Good","John Doe");

	        callQuality.saveCallQuality(callQuality);

	        CallQuality loadedCallQuality = callQuality.loadCallQuality(1);

	    }

}
