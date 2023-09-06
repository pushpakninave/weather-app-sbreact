
# Weather App
![Weather App](https://github.com/pushpakninave/weather-app-sbreact/assets/65614791/31412c7d-01c5-4d7e-b693-ecc3ca419e43)


The Weather App is a web application built using Spring Boot and React.js. It communicates with a remote API to fetch weather data and displays it in the frontend.

## Technologies Used

- **Spring Boot**: The backend of the application is developed using Spring Boot, providing RESTful API endpoints to fetch weather data.

- **React.js**: The frontend is built with React.js, providing an interactive user interface for displaying weather information.

- **RestTemplate**: Spring Boot's RestTemplate is used to make HTTP requests to the remote weather API.

- **AWS**: The application is hosted on AWS, making it accessible from anywhere on the internet.

## Installation

### Prerequisites

- [Java JDK](https://www.oracle.com/java/technologies/javase-downloads.html) (version X.X or higher)
- [Node.js](https://nodejs.org/) (version X.X or higher)
- [npm](https://www.npmjs.com/get-npm) (comes with Node.js)
- [Git](https://git-scm.com/downloads)

### Backend (Spring Boot)

1. Clone the repository:

   `git clone https://github.com/pushpakninave/weather-app-sbreact.git`

   `cd weather-app-sbreact `
   
   Build and run the Spring Boot application:

3. Backend(Spring-boot)
   `./mvnw spring-boot:run`
   The backend server will start at http://localhost:8080.

4. Frontend (React.js)
   In a new terminal window, navigate to the frontend directory:
   `cd weather-app/frontend`
   Install the frontend dependencies:
   `npm install`
   Start the React development server:
   `npm start`
   The React app will be accessible at http://localhost:3000.
   
## AWS:
endpoint: `http://weather-client.ap-south-1.elasticbeanstalk.com/weather?cityName={cityname here}`

### Usage:
Open your web browser and go to http://localhost:3000 to access the Weather App.
Enter a city name to fetch weather data for that city.
Explore the weather information displayed on the page.


### Author:
[Pushpak Ninave]()

## Video:
https://github.com/pushpakninave/weather-app-sbreact/assets/65614791/e62f3cee-a02b-4fb8-946e-d5d9ee0e2ed5

