package com.greenapplesolutions.dbloader.editors;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.part.EditorPart;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;

public class FileLoader extends EditorPart {
	private Text text;
	private Table table;
	public static final String ID = "com.greenapplesolutions.dbLoader.fileLoader";

	public FileLoader() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void doSave(IProgressMonitor monitor) {
		// TODO Auto-generated method stub

	}

	@Override
	public void doSaveAs() {
		// TODO Auto-generated method stub

	}

	@Override
	public void init(IEditorSite site, IEditorInput input)
			throws PartInitException {
		setSite(site);
		setInput(input);
		setPartName(input.getName());
	}

	@Override
	public boolean isDirty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isSaveAsAllowed() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void createPartControl(Composite parent) {
		parent.setLayout(new FormLayout());

		Label lblNewLabel = new Label(parent, SWT.NONE);
		lblNewLabel.setFont(SWTResourceManager.getFont("Segoe UI", 9,
				SWT.ITALIC));
		FormData fd_lblNewLabel = new FormData();
		fd_lblNewLabel.top = new FormAttachment(0, 10);
		fd_lblNewLabel.bottom = new FormAttachment(0, 31);
		fd_lblNewLabel.left = new FormAttachment(0, 10);
		lblNewLabel.setLayoutData(fd_lblNewLabel);
		lblNewLabel.setText("Court Selected");

		Label lblNewLabel_1 = new Label(parent, SWT.NONE);
		FormData fd_lblNewLabel_1 = new FormData();
		fd_lblNewLabel_1.top = new FormAttachment(lblNewLabel, 17);
		fd_lblNewLabel_1.left = new FormAttachment(0, 10);
		lblNewLabel_1.setLayoutData(fd_lblNewLabel_1);
		lblNewLabel_1.setText("Choose File");

		text = new Text(parent, SWT.BORDER);
		FormData fd_text = new FormData();
		fd_text.left = new FormAttachment(lblNewLabel_1, 6);
		fd_text.top = new FormAttachment(lblNewLabel_1, -3, SWT.TOP);
		text.setLayoutData(fd_text);

		Button btnNewButton = new Button(parent, SWT.NONE);
		fd_lblNewLabel.right = new FormAttachment(btnNewButton, 0, SWT.RIGHT);
		fd_text.right = new FormAttachment(100, -91);
		FormData fd_btnNewButton = new FormData();
		fd_btnNewButton.top = new FormAttachment(lblNewLabel_1, -5, SWT.TOP);
		fd_btnNewButton.left = new FormAttachment(text, 6);
		btnNewButton.setLayoutData(fd_btnNewButton);
		btnNewButton.setText("New Button");

		table = new Table(parent, SWT.BORDER | SWT.FULL_SELECTION | SWT.MULTI);

		// table.setVisible(false);
		FormData fd_table = new FormData();
		fd_table.left = new FormAttachment(lblNewLabel, 0, SWT.LEFT);
		fd_table.top = new FormAttachment(100, -381);
		fd_table.right = new FormAttachment(lblNewLabel, 0, SWT.RIGHT);
		fd_table.bottom = new FormAttachment(100, -10);
		table.setLayoutData(fd_table);
		table.setHeaderVisible(true);
		table.setLinesVisible(true);

		TableColumn tblclmnAppellant = new TableColumn(table, SWT.NONE);
		tblclmnAppellant.setWidth(100);
		tblclmnAppellant.setText("Appellant");
		TableItem item = new TableItem(table, SWT.None);
		String name[] = "keshav,Megan".split(",");
		item.setText(0, "Megan");
		item.setText(1, "Megan");
		TableItem item1 = new TableItem(table, SWT.None);
		item1.setText(1, "keshav");
		TableColumn tblclmnRespondant = new TableColumn(table, SWT.NONE);
		tblclmnRespondant.setWidth(100);
		tblclmnRespondant.setText("Respondant");
		table.setRedraw(true);
		// TODO Auto-generated method stub

	}

	@Override
	public void setFocus() {
		// TODO Auto-generated method stub

	}
}
