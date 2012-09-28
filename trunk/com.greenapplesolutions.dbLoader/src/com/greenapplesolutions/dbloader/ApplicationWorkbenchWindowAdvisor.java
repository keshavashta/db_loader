package com.greenapplesolutions.dbloader;

import java.awt.Dimension;
import java.awt.Toolkit;

import org.eclipse.swt.graphics.Point;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.application.ActionBarAdvisor;
import org.eclipse.ui.application.IActionBarConfigurer;
import org.eclipse.ui.application.IWorkbenchWindowConfigurer;
import org.eclipse.ui.application.WorkbenchWindowAdvisor;

import util.JTLogger;

import com.greenapplesolutions.dbloader.editors.FileLoader;

import editorInput.FileLoaderInput;

public class ApplicationWorkbenchWindowAdvisor extends WorkbenchWindowAdvisor {

	public ApplicationWorkbenchWindowAdvisor(IWorkbenchWindowConfigurer configurer) {
		super(configurer);
	}

	public ActionBarAdvisor createActionBarAdvisor(
			IActionBarConfigurer configurer) {
		return new ApplicationActionBarAdvisor(configurer);
	}

	public void preWindowOpen() {
		IWorkbenchWindowConfigurer configurer = getWindowConfigurer();
		Dimension dim=Toolkit.getDefaultToolkit().getScreenSize();
		configurer.setInitialSize(new Point((int) dim.getWidth(), (int) dim.getHeight()));
		configurer.setShowCoolBar(false);
		configurer.setShowStatusLine(false);
		configurer.setTitle("Db Loader");
		JTLogger.getInstance().setError("Hello");
	}
}
