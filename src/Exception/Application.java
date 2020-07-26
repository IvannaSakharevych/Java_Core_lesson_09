/*
 * Some information about the program.
 */

package Exception;

import java.util.Scanner;

/**
 * @author Ivanna Sakharevych
 * @since Java 1.8
 * @version 1.1  26 July 2020
 */

public class Application {

	/* Enumeration, what describe seasons. */
	enum Seasons {

		WINTER, SPRING, SUMMER, FALL;

	}

	/* Enumeration, what describe months. */
	enum Months {

		JANUARY(31, Seasons.WINTER), 
		FEBRUARY(28, Seasons.WINTER), 
		MARCH(31, Seasons.SPRING), 
		APRIL(30, Seasons.SPRING),
		MAY(31, Seasons.SPRING), 
		JUNE(30, Seasons.SUMMER), 
		JULY(31, Seasons.SUMMER), 
		AUGUST(31, Seasons.SUMMER),
		SEPTEMBER(30, Seasons.FALL), 
		OCTOBER(31, Seasons.FALL), 
		NOVEMBER(30, Seasons.FALL),
		DECEMBER(31, Seasons.WINTER);

		private int days;
		Seasons season;

		/* The constructor of the class, which describes how many days have the month and what it is a season. */
		Months(int days, Seasons season) {
			this.days = days;
			this.season = season;
		}

		public int getDays() {
			return days;
		}

		public Seasons getSeason() {
			return season;
		}

	}

	public static void main(String[] args) throws WrongInputConsoleParametersException {

		Months[] masMonths = Months.values();
		Seasons[] masSeasons = Seasons.values();
		Scanner scanner = new Scanner(System.in);

		/* An infinite loop, that calls the menu method. */
		while (true) {
			menu();

			/* Takes the value from the scanner and starts the corresponding case. */
			switch (scanner.next()) {

			case "1": {
				System.out.println("������ ����� �����");
				scanner = new Scanner(System.in);
				String month = scanner.next().toUpperCase();

				boolean flag = false;

				for (Months m : masMonths) {
					if (m.name().equals(month)) {
						System.out.println("����� ����� ��������");
						flag = true;
					}

				}

				if (!flag) {
					//System.out.println("����� ����� �� ��������");
					String errorMessage = "����� ����� �� ��������";
					throw new WrongInputConsoleParametersException(errorMessage);
				}

				break;
			}

			case "2": {
				System.out.println("������ ���� ����");
				scanner = new Scanner(System.in);
				String season = scanner.next().toUpperCase();

				boolean flag = false;

				for (Months m : masMonths) {
					if (m.getSeason().name().equals(season)) {
						flag = true;
					}

				}

				if (flag) {
					Seasons seasonsValue = Seasons.valueOf(season);
					for (Months m2 : masMonths) {
						if (m2.getSeason().toString().equalsIgnoreCase(season)) {
							System.out.println(m2);
						}
					}

				}

				if (!flag) {
					//System.out.println("���� ���� �� ��������");
					String errorMessage = "���� ���� �� ��������";
					throw new WrongInputConsoleParametersException(errorMessage);
				}

				break;
			}

			case "3": {
				System.out.println("������ ������� ���");
				scanner = new Scanner(System.in);
				int days = scanner.nextInt();

				boolean flag = false;

				for (Months m : masMonths) {
					if (m.getDays() == days) {
						System.out.println(m.name());
						flag = true;
					}

				}

				if (!flag) {
					//System.out.println("̳����� � ����� ������� ��� �� ��������");
					String errorMessage = "̳����� � ����� ������� ��� �� ��������";
					throw new WrongInputConsoleParametersException(errorMessage);
				}

				break;
			}

			case "4": {
				System.out.println("������ ������� ���");
				scanner = new Scanner(System.in);
				int days = scanner.nextInt();

				boolean flag = false;

				for (Months m : masMonths) {
					if (m.getDays() < days) {
						System.out.println(m.name());
						flag = true;
					}

				}

				if (!flag) {
					//System.out.println("̳����� � ����� ������� ��� �� ��������");
					String errorMessage = "̳����� � ����� ������� ��� �� ��������";
					throw new WrongInputConsoleParametersException(errorMessage);
				}

				break;
			}

			case "5": {
				System.out.println("������ ������� ���");
				scanner = new Scanner(System.in);
				int days = scanner.nextInt();

				boolean flag = false;

				for (Months m : masMonths) {
					if (m.getDays() > days) {
						System.out.println(m.name());
						flag = true;
					}

				}

				if (!flag) {
					//System.out.println("̳����� � ����� ������� ��� �� ��������");
					String errorMessage = "̳����� � ����� ������� ��� �� ��������";
					throw new WrongInputConsoleParametersException(errorMessage);
				}

				break;
			}

			case "6": {
				System.out.println("������ ���� ����");
				scanner = new Scanner(System.in);
				String season = scanner.next().toUpperCase();

				boolean flag = false;

				for (Seasons s : masSeasons) {
					if (s.name().equals(season)) {
						flag = true;
					}
				}

				if (flag) {
					System.out.println("�������� ���� ���� - ");
					Seasons seasonsValue6 = Seasons.valueOf(season);
					int ordinal = seasonsValue6.ordinal();
					if (ordinal == (masSeasons.length - 1)) {
						ordinal = 0;
						System.out.println(masSeasons[ordinal]);
					} else {
						System.out.println(masSeasons[ordinal + 1]);
					}

				}

				if (!flag) {
					//System.out.println("���� ���� �� ��������");
					String errorMessage = "���� ���� �� ��������";
					throw new WrongInputConsoleParametersException(errorMessage);
				}

				break;
			}

			case "7": {
				System.out.println("������ ���� ����");
				scanner = new Scanner(System.in);
				String season = scanner.next().toUpperCase();

				boolean flag = false;

				for (Seasons s : masSeasons) {
					if (s.name().equals(season)) {
						flag = true;
					}
				}

				if (flag) {
					System.out.println("��������� ���� ���� - ");
					Seasons seasonsValue7 = Seasons.valueOf(season);
					int ordinal = seasonsValue7.ordinal();
					if (ordinal == 0) {
						ordinal = (masSeasons.length - 1);
						System.out.println(masSeasons[ordinal]);
					} else {
						System.out.println(masSeasons[ordinal - 1]);
					}

				}

				if (!flag) {
					//System.out.println("���� ���� �� ��������");
					String errorMessage = "���� ���� �� ��������";
					throw new WrongInputConsoleParametersException(errorMessage);
				}

				break;
			}

			case "8": {
				System.out.println("̳����, �� ����� ����� ������� ���");
				// scanner = new Scanner(System.in);

				boolean flag = false;

				for (Months m : masMonths) {
					if (m.getDays() % 2 == 0) {
						System.out.println(m.name());
						flag = true;
					}

				}

				break;
			}

			case "9": {
				System.out.println("̳����, �� ����� ������� ������� ���");
				// scanner = new Scanner(System.in);

				boolean flag = false;

				for (Months m : masMonths) {
					if (m.getDays() % 2 != 0) {
						System.out.println(m.name());
						flag = true;
					}
				}

				break;
			}

			case "10": {
				System.out.println("������ ����� �����");
				scanner = new Scanner(System.in);
				String month = scanner.next().toUpperCase();

				boolean flag = false;

				for (Months m : masMonths) {
					if (m.name().equals(month)) {
						flag = true;
					}

				}

				if (flag) {
					for (Months m : masMonths) {
						if (m.name().equals(month)) {
							if (m.getDays() % 2 == 0) {
								System.out.println("��� ����� �� ����� ������� ���");
							} else {
								System.out.println("��� ����� �� ������� ������� ���");
							}
						}
					}

				}

				if (!flag) {
					//System.out.println("����� ����� �� ��������");
					String errorMessage = "����� ����� �� ��������";
					throw new WrongInputConsoleParametersException(errorMessage);
				}

				break;
			}

			}

		}

	}

	/* The method displays the application menu on the console. */
	static void menu() {
		System.out.println("�������� 1, ��� ��������� �� � ����� �����");
		System.out.println("�������� 2, ��� ������� �� ����� � ����� � ����� ����");
		System.out.println("�������� 3, ��� ������� �� ����� �� ����� ���� ���� ������� ���");
		System.out.println("�������� 4, ��� ������� �� ����� �� ����� �� ����� ����� ������� ���");
		System.out.println("�������� 5, ��� ������� �� ����� �� ����� �� ����� ����� ������� ���");
		System.out.println("�������� 6, ��� ������� �� ����� �������� ���� ����");
		System.out.println("�������� 7, ��� ������� �� ����� ��������� ���� ����");
		System.out.println("�������� 8, ��� ������� �� ����� �� ����� �� ����� ����� ������� ���");
		System.out.println("�������� 9, ��� ������� �� ����� �� ����� �� ����� ������� ������� ���");
		System.out.println("�������� 10, ��� ������� �� ����� �� �������� � ������ ����� �� ����� ������� ���");

	}

}
