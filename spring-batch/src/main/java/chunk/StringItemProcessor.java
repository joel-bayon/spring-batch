package chunk;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

@Component("processor")
public class StringItemProcessor
implements ItemProcessor<String, String> {
@Override
public String process(String item) throws Exception {
return "*** "+item+" ***";
}
}
