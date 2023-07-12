package archivos;
/*
Gestor de Contactos (Variables, Bucles, Sentencias If, Funciones, Operaciones de Entrada y Salida, Manejo de Archivos)

Cree un programa de gestión de contactos que permita al usuario añadir, buscar, modificar y eliminar contactos. Cada contacto debe tener un nombre, un número de teléfono y una dirección de correo electrónico. Utilice funciones para implementar las diferentes operaciones, variables para almacenar la información de los contactos, bucles y sentencias if para buscar y modificar contactos, y operaciones de entrada/salida y manejo de archivos para almacenar la información de los contactos de manera persistente entre sesiones.
*/

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;

import java.util.ArrayList;
import java.util.List;

import java.io.File;
import java.io.FileReader;

public class NoTocar {
    private static final String FILENAME = "contacts.txt";
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static List<String> contacts = new ArrayList<>();
    private static BufferedReader fileReader;

    public static void main(String[] args) {
        boolean exit = false;
        try {
            loadContacts();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        while (!exit) {
            menu();
            try {
                String option = reader.readLine();
                switch (option) {
                    case "1":
                        addContact();
                        break;
                    case "2":
                        searchContact();
                        break;
                    case "3":
                        modifyContact();
                        break;
                    case "4":
                        deleteContact();
                        break;
                    case "5":
                        saveContacts();
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Opción inválida");
                        break;
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }

    public static void loadContacts() throws Exception {
        File file = new File(FILENAME);
        if (file.exists()) {
            fileReader = new BufferedReader(new FileReader(file));
            String line;
            while ((line = fileReader.readLine()) != null) {
                contacts.add(line);
            }
            fileReader.close();
        }
    }

    public static void menu() {
        System.out.println("1. Añadir contacto");
        System.out.println("2. Buscar contacto");
        System.out.println("3. Modificar contacto");
        System.out.println("4. Eliminar contacto");
        System.out.println("5. Salir");
    }

    public static void addContact() throws Exception {
        System.out.println("Añadir contacto");
        System.out.println("Nombre: ");
        String name = reader.readLine();
        System.out.println("Teléfono: ");
        String phone = reader.readLine();
        System.out.println("Email: ");
        String email = reader.readLine();
        String contact = name + "," + phone + "," + email;
        contacts.add(contact);
        System.out.println("Contacto añadido");
    }

    public static void searchContact() throws Exception {
        System.out.println("Buscar contacto");
        System.out.println("Nombre: ");
        String name = reader.readLine();
        for (String contact : contacts) {
            String[] data = contact.split(",");
            if (data[0].equals(name)) {
                System.out.println("Nombre: " + data[0]);
                System.out.println("Teléfono: " + data[1]);
                System.out.println("Email: " + data[2]);
                return;
            }
        }
        System.out.println("Contacto no encontrado");
    }

    public static void modifyContact() throws Exception {
        System.out.println("Modificar contacto");
        System.out.println("Nombre: ");
        String name = reader.readLine();
        for (int i = 0; i < contacts.size(); i++) {
            String contact = contacts.get(i);
            String[] data = contact.split(",");
            if (data[0].equals(name)) {
                System.out.println("Nombre: " + data[0]);
                System.out.println("Teléfono: " + data[1]);
                System.out.println("Email: " + data[2]);
                System.out.println("Nuevo nombre: ");
                String newName = reader.readLine();
                System.out.println("Nuevo teléfono: ");
                String newPhone = reader.readLine();
                System.out.println("Nuevo email: ");
                String newEmail = reader.readLine();
                String newContact = newName + "," + newPhone + "," + newEmail;
                contacts.set(i, newContact);
                System.out.println("Contacto modificado");
                return;
            }
        }
        System.out.println("Contacto no encontrado");
    }

    public static void deleteContact() throws Exception {
        System.out.println("Eliminar contacto");
        System.out.println("Nombre: ");
        String name = reader.readLine();
        for (int i = 0; i < contacts.size(); i++) {
            String contact = contacts.get(i);
            String[] data = contact.split(",");
            if (data[0].equals(name)) {
                System.out.println("Nombre: " + data[0]);
                System.out.println("Teléfono: " + data[1]);
                System.out.println("Email: " + data[2]);
                System.out.println("¿Está seguro que desea eliminar este contacto? (s/n)");
                String option = reader.readLine();
                if (option.equals("s")) {
                    contacts.remove(i);
                    System.out.println("Contacto eliminado");
                }
                return;
            }
        }
        System.out.println("Contacto no encontrado");
    }

    public static void saveContacts() throws Exception {
        System.out.println("Guardando contactos...");
        String content = "";
        for (String contact : contacts) {
            content += contact + "\n";
        }
        File file = new File(FILENAME);
        FileWriter fileWriter = new FileWriter(file);
        fileWriter.write(content);
        fileWriter.close();
    }
}
