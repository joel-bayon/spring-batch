package flat.file;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

@Component("processor")
public class ContactItemProcessor implements ItemProcessor<Contact, String> {
	@Override
	public String process(Contact item) throws Exception {
		return "*** " + item + " ***";
	}
}
