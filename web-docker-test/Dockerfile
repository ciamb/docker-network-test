FROM node:alpine as build
WORKDIR /app
COPY . .
RUN npm install
RUN npm run build

FROM nginx:alpine as runtime
COPY --from=build /app/dist/web-docker-test/ /usr/share/nginx/html
EXPOSE 80

