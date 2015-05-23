package titanic;

import javax.swing.JPanel;

public class LeftPanelController extends CenterPanelController{
	
	private LeftPanel leftPanel;
	private LeftToolbarController leftToolbarController;
	public LeftToolbarController getLeftToolbarController() {
		return leftToolbarController;
	}
	public FileTreeController getFileTreeController() {
		return fileTreeController;
	}
	private FileTreeController fileTreeController;
	
	public LeftPanelController(){}
	public LeftPanelController(LeftPanel leftPanel){
		this.leftPanel = leftPanel;
		setControllers();
		
	}
	private void setControllers()
	{
		leftToolbarController = new LeftToolbarController(leftPanel.getToolbar());
		fileTreeController = new FileTreeController(leftPanel.getfileTree());
		
	}
	public void OpenDSMStatus()
	{
		
		
	}
	protected void expandTree() {
		leftPanel.getfileTree();
		fileTreeController.expandAll(leftPanel.getfileTree(), 1, leftPanel.getfileTree().getRowCount());;
	}
}
