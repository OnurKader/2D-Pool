package com.pool.main;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.pool.game.GameManager;
import com.pool.main.Menus.MainFrame;

public class Menu
{
	private static final long serialVersionUID = 5571915874117869721L;
	private static boolean started = false;
	public static int mode = -1;

	public static void main(String[] args)
	{
		new Menu();
		do
		{
			if (mode != -1)
			{
				started = true;
				start_game(mode);
			}
			try
			{
				Thread.sleep(333);
			} catch (final InterruptedException e)
			{
				e.printStackTrace();
			}
		} while (!started);

	}

	private static void start_game(int mode)
	{
		final Game game = new Game(new GameManager(mode));
		game.start();
	}

	private JPanel panel;
	private JFrame frame;

	private JLabel label;

	private MainFrame mainframe;

	Menu()
	{
		frame = new JFrame("Pool Game");
		mainframe = new MainFrame();
		mainframe.setMFrame(frame);
	}

}