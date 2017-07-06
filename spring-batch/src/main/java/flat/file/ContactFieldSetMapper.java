package flat.file;

import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.stereotype.Component;
import org.springframework.validation.BindException;

@Component
public class ContactFieldSetMapper implements FieldSetMapper<Contact> {
	@Override
	public Contact mapFieldSet(FieldSet fieldSet) throws BindException {
		return new Contact(fieldSet.readString("firstname"), fieldSet.readString("lastname"),
				fieldSet.readDate("birth", "yyyy-MM-dd"));
	}
}
