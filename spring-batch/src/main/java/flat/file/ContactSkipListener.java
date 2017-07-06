package flat.file;

import org.springframework.batch.core.annotation.OnSkipInRead;
import org.springframework.batch.item.file.FlatFileParseException;
import org.springframework.stereotype.Component;

@Component("skipListener")
public class ContactSkipListener {

	@OnSkipInRead
	public void onSkipReadItem(Exception e) throws Exception {
		System.out.println("****onSkipReadItem");
		if(e instanceof FlatFileParseException) {
			FlatFileParseException ffpe = (FlatFileParseException) e;
			System.out.println("line N° " + ffpe.getLineNumber() + " content = " + ffpe.getInput());
			return;
		}
		throw e;
	}
}
