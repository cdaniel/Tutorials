package org.xtext.example.mydsl.ui.wizard;

import org.eclipse.ui.dialogs.WizardNewProjectCreationPage;
import org.eclipse.xtext.ui.wizard.IProjectInfo;
import org.eclipse.xtext.ui.wizard.XtextNewProjectWizard;
import org.eclipse.xtext.ui.wizard.IProjectCreator;
import com.google.inject.Inject;

public class InsuranceNewProjectWizard extends XtextNewProjectWizard {

	private WizardNewProjectCreationPage mainPage;

	@Inject
	public InsuranceNewProjectWizard(IProjectCreator projectCreator) {
		super(projectCreator);
		setWindowTitle("New Insurance Project");
	}

	/**
	 * Use this method to add pages to the wizard.
	 * The one-time generated version of this class will add a default new project page to the wizard.
	 */
	public void addPages() {
		mainPage = new WizardNewProjectCreationPage("basicNewProjectPage");
		mainPage.setTitle("Insurance Project");
		mainPage.setDescription("Create a new Insurance project.");
		addPage(mainPage);
	}

	/**
	 * Use this method to read the project settings from the wizard pages and feed them into the project info class.
	 */
	@Override
	protected IProjectInfo getProjectInfo() {
		org.xtext.example.mydsl.ui.wizard.InsuranceProjectInfo projectInfo = new org.xtext.example.mydsl.ui.wizard.InsuranceProjectInfo();
		projectInfo.setProjectName(mainPage.getProjectName());
		return projectInfo;
	}

}
